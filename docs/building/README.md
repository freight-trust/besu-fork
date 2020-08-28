# Besu from Source 

Dependency
Building from source has a single dependency: `libsodium` version 1.0.16 or higher is needed in order to build Besu and run the tests.

If you are not planning on running the tests, you can skip this step.

To install, follow instructions here or type in the following commands on MacOS or Ubuntu.

MacOS:
$ brew install libsodium

Ubuntu (16.04 LTS):
$ apt install libsodium18

Ubuntu (18.04 LTS):
$ apt install libsodium23

Ubuntu (14.04 LTS):
You can find the appropriate package (v1.0.16-0) files here:
https://launchpad.net/ubuntu/+source/libsodium
https://launchpad.net/~phoerious/+archive/ubuntu/keepassxc/+sourcepub/8814980/+listing-archive-extra


The `sudo` command might be needed on Linux, and if the screen prompts you to enter a password, type your password and press enter.

## Quickstart
```bash
git clone --recursive https://github.com/hyperledger/besu
cd besu
./gradlew build 
./gradlew integrationTest LTS
```

### Checkout source code
`git clone --recursive git@github.com:hyperledger/besu.git`
or
`git clone --recursive https://github.com/hyperledger/besu`

### Gradle Tasks
See what tasks are available 
To see all of the gradle tasks that are available:
```bash
cd besu
./gradlew tasks  
```

## Build from source
Note: On Windows, to run gradlew, you must have the JAVA_HOME system variable set to the Java installation directory. For example: JAVA_HOME = C:\Program Files\Java\jdk1.8.0_181

Build the distribution binaries: 
```bash
cd besu
./gradlew installDist
```

## Run Besu:
```bash
cd build\install\besu
./bin/besu --help
```

## Running Developer Builds
Build and run Besu with default options using:
```bash
./gradlew installDist
```
By default this stores all persistent data in build/install/besu.

To set custom CLI arguments for the Besu execution:

`cd build/install/besu`

`./bin/besu --discovery-enabled=false --data-path=/tmp/besutmp`
