# Spring Boot App (Airboxr Backend)
#

#### _Overview_

- [Spring Boot Readme](https://github.com/codecentric/springboot-sample-app/blob/master/README.md): Please  checkout this spring boot readme file in order to get the minimal spring boot app requirements.
- Ensure that you have installed **Java 1.8** 
- The maven version used in this app is [maven 4.0.0](https://maven.apache.org/xsd/maven-4.0.0.xsd)

#
#### _Enviornment and DB Details:_
- API Devlopment: Spring Boot (STS).
- Database: Postgresql
- ORM : Hibernate(JPA)

# _API Details_
##### 1. Get Track entity by name

- Request Type : *'GET'*
- URL : ${baseurl}/track?trackName="{{Track Name}}"
- Curl : *curl --location --request GET 'localhost:8080/track?trackName=Snowballed'*
- Sample API GET Request : localhost:8080/track?trackName=Snowballed


##### 2. Get PlaylistTrack entity by playlist name & track name

 - Request Type = *'GET'*
- URL = ${baseurl}/track/playlist?playlistName={{Playlist Name}}&trackName={{Track Name}}
- Curl = *curl --location --request GET 'localhost:8080/track/playlist?playlistName=lounlif&trackName=xjjiemf*
- Sample API GET Request = localhost:8080/track/playlist?playlistName=Music&trackName=Snowballed
**Note :** Please note that this API will return list of playlisttracks entity

##### 3. Get number of tracks for a playlist name

- Request Type : *'GET'*
- URL : ${baseurl}/track/count?playlistName={{Playlist Name}}
- Curl : *curl --location --request GET 'localhost:8080/track/count?playlistName=Music'*
- Sample API GET Request : localhost:8080/track/count?playlistName=Music



#


[DB File](https://drive.google.com/file/d/1i5Kkyg3_wA1t-ZJs-gwKdpXH9HzxB-zI/view?usp=sharing)
#
