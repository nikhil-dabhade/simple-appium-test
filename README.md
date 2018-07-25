# sample-appium-test

# Pre-requisites to run on AWS Device Farm

To package your Appium tests for AWS Device Farm, you need maven installed on your local host machine. Maven can be installed using the instructions here: https://maven.apache.org/install.html 


# Steps to package your tests

- Assuming you have all the pre-requsities installed from the previous section, you need to run the following command to get maven to package your tests:

  > mvn clean package -DskipTests=true

- The output of the above command will create a zip file under \<root of your project>/target/zip-with-dependencies.zip
  This zip file contains the test build output along with all the dependencies used by the tests.  
