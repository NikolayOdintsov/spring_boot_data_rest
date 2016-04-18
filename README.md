# spring_boot_data_rest

Spring boot rest data app for mongodb.

1.Create container for mongodb:
docker run --name [docker mongodb container name] -d -v /[volume name]:/data/db -p 27017:27017 [mongodb image name] --smallfiles

2. Run spring-boot docker build plugin:
mvn package docker:build

3. Create spring-boot container linked to data storage container:
docker run -d -p 8080:8080 --name [docker spring-boot container name] --link [docker mongodb container name]:mongodb [spring-boot image name]

where 'mongodb' - link name

4. Check links: docker inspect -f "{{ .HostConfig.Links }}" [docker spring-boot container name]
5. Enter mongo container: docker exec -it [docker mongodb container name] mongo

http://[docker-machine host]:8080/products
