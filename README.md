Configuration:

Linux system

Docker and docker compose must be installed

Open ports: 4444, 9090

if on Cloud create Firewall rule

Place file browsers.json in /etc/selenoid/browsers.json path

Execute docker-compose up in directory where docker-compose.yaml file is placed

Verify that on port 4444 there is message Selenoid.
Check that on port 9090 Selenoid UI green labels
 
Also verify docker images
to check that chrome images is ready

Run tests using configuration from SomeTest class

Place in  VM options in IDEA configuration
-ea -Dtestng.dtd.http=true to run tests