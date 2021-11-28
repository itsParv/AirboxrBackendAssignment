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

**Note**: Please note that once you are done with base setup, you need to change the DB URL in application.properties file according to your system.

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

# Images for API Performance Ref, before and after indexing:

<img width="993" alt="API#1 -  track by name (Before Index) " src="https://user-images.githubusercontent.com/40753350/143783764-638b4b43-3470-4494-8bd5-623e2c841609.png">
<img width="993" alt="API#1 -  track by name(After Indexing)" src="https://user-images.githubusercontent.com/40753350/143783769-1fa99c16-0326-42cf-9bf0-1de3df51790a.png">
<img width="993" alt="API#2 getPlaylistTrackEntity (Befor indexing)" src="https://user-images.githubusercontent.com/40753350/143783771-05c8182e-b374-4294-80d8-aa26f0534a25.png">
<img width="993" alt="API#3 getCount (After indexing)" src="https://user-images.githubusercontent.com/40753350/143783772-c4bf1c1f-1c98-45fe-bf64-fd59964d7b0e.png">
<img width="993" alt="API#3 getCount(Before Indexing)" src="https://user-images.githubusercontent.com/40753350/143783773-f354d916-c212-4d92-98ee-0a270a5b8aa1.png">
<img width="993" alt="API#1(After Indexing)" src="https://user-images.githubusercontent.com/40753350/143783775-31d4750b-9277-4bb7-9a61-e6d01f22cfe6.png">



