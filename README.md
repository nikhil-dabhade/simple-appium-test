# sample-appium-test

# Pre-requisites to run on AWS Device Farm

To package your Appium tests for AWS Device Farm, you need maven installed on your local host machine. Maven can be installed using the instructions here: https://maven.apache.org/install.html 


# Steps to package your tests

- Assuming you have all the pre-requsities installed from the previous section, you need to run the following command to get maven to package your tests:

  > mvn clean package -DskipTests=true
  
  A detailed desciption on what does the maven tool do behind the scene can be found here: https://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-appium-java-testng.html

- The output of the above command will create a zip file under \<root of your project>/target/zip-with-dependencies.zip
  This zip file is the test input to AWS Device Farm and contains the test build output along with all the dependencies used by the tests. 

# Steps to schedule a test run

- To schedule a Appium Java TestNG test run on Device Farm, use the following instructions: https://docs.aws.amazon.com/devicefarm/latest/developerguide/how-to-create-test-run.html 
