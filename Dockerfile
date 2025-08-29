# Use Maven with Eclipse Temurin JDK base image
FROM maven:3.9.6-eclipse-temurin-11

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Create output directories
RUN mkdir -p output/ExtentReports/SparkReport \
    output/ExtentReports/PdfReport \
    output/ExtentReports/JsonReport \
    output/screenshot

# Install dependencies and Chromium browser + chromedriver from PPA (avoid snap)
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        wget \
        curl \
        unzip \
        gnupg2 \
        software-properties-common \
        libappindicator3-1 \
        libasound2 \
        libatk-bridge2.0-0 \
        libcups2 \
        libnspr4 \
        libnss3 \
        libxcomposite1 \
        libxdamage1 \
        libxfixes3 \
        libxrandr2 \
        libxtst6 \
        lsb-release \
        fonts-liberation \
        xdg-utils \
        ca-certificates && \
    add-apt-repository ppa:saiarcot895/chromium-beta && \
    apt-get update && \
    apt-get install -y chromium-browser chromium-chromedriver && \
    ln -s /usr/lib/chromium-browser/chromedriver /usr/bin/chromedriver && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# Set environment variables for Chrome and Chromedriver paths
ENV CHROME_BIN="/usr/bin/chromium-browser"
ENV CHROMEDRIVER_BIN="/usr/bin/chromedriver"

# Verify installations (optional)
RUN $CHROME_BIN --version && $CHROMEDRIVER_BIN --version

# Command to run Maven tests on container start
CMD ["mvn", "clean", "test", \
     "-Dsurefire.argLine=-Dfile.encoding=UTF-8 -Dmaven.compiler.parameters=true", \
     "-DtestFailureIgnore=false" \
    ]
