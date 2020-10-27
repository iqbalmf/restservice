# API Specification

## Create User

Request:
- Method: POST
- Endpoint: `/api/v1/user`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "name": "string",
  "password": "string",
  "email": "string",
  "idRole": "Integer"
}
```
Response:
```json
{
"status": "integer",
"info": "string",
"content": {
      "id": "integer",
      "userid":"long, unique",
      "name": "string",
      "password": "string",
      "email": "string",
      "isActive": "boolean",
      "urlActivate": "string",
      "createdAt": "date"
    }
}
```
## GET LIST USER
Request:
- Method: GET
- Endpoint: `/api/v1/user/`
- Header: 
    - Content-Type: application/json
    
Response :
```json
{
  "status": "integer",
  "info": "string",
  "content": 
   [   
        {
              "id": "integer",
              "userid":"long, unique",
              "name": "string",
              "password": "string",
              "email": "string",
              "isActive": "boolean",
              "urlActivate": "string",
              "createdAt": "date"
        },
        {
              "id": "integer",
              "userid":"long, unique",
              "name": "string",
              "password": "string",
              "email": "string",
              "isActive": "boolean",
              "urlActivate": "string",
              "createdAt": "date"
        }
   ]
}
```
## UPDATE USER
Request:
- Method: PUT
- Endpoint: `/api/v1/user/{id_user}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
      "id": "integer",
      "userid":"long, unique",
      "name": "string",
      "password": "string",
      "email": "string",
      "isActive": "boolean",
      "urlActivate": "string"
    }
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": {
        "id": "integer",
        "userid":"long, unique",
        "name": "string",
        "password": "string",
        "email": "string",
        "isActive": "boolean",
        "urlActivate": "string",
        "createdAt": "date",
        "updatedAt": "date"
      }
}
```
## DELETE USER
Request:
- Method: DELETE
- Endpoint: `/api/v1/user/{id_user}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string"
}
```
## Create Acara
Request:
- Method: POST
- Endpoint: `/api/v1/acara`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "title": "string",
  "content": "string",
  "author": "string",
  "location": "string",
  "startDate": "date",
  "endDate": "date",
  "imageThumbnail": "string",
  "category": "string",
  "isShowing": "boolean"
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "location": "string",
      "startDate": "date",
      "endDate": "date",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Get List Acara
Request:
- Method: GET
- Endpoint: `/api/v1/acara/`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
   [   
        {
          "id": "integer",
          "title": "string",
          "content": "string",
          "author": "string",
          "location": "string",
          "startDate": "date",
          "endDate": "date",
          "imageThumbnail": "string",
          "category": "string",
          "isShowing": "boolean",
          "createdAt": "Date",
          "updatedAt": "Date"
        },
        {
          "id": "integer",
          "title": "string",
          "content": "string",
          "author": "string",
          "location": "string",
          "startDate": "date",
          "endDate": "date",
          "imageThumbnail": "string",
          "category": "string",
          "isShowing": "boolean",
          "createdAt": "Date",
          "updatedAt": "Date"
        }
   ]
}
```
## Get Acara Detail
Request:
- Method: GET
- Endpoint: `/api/v1/acara/{id_acara}`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "location": "string",
      "startDate": "date",
      "endDate": "date",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Update Acara
Request:
- Method: PUT
- Endpoint: `/api/v1/acara/{id_acara}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "title": "string",
  "content": "string",
  "author": "string",
  "location": "string",
  "startDate": "date",
  "endDate": "date",
  "imageThumbnail": "string",
  "category": "string",
  "isShowing": "boolean"
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "location": "string",
      "startDate": "date",
      "endDate": "date",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Delete Acara
Request:
- Method: DELETE
- Endpoint: `/api/v1/acara/{id_acara}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string"
}
```
## Create Article 
Request:
- Method: POST
- Endpoint: `/api/v1/article`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "title": "string",
  "content": "string",
  "author": "string",
  "imageThumbnail": "string",
  "category": "string",
  "isShowing": "boolean"
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Get List Article
Request:
- Method: GET
- Endpoint: `/api/v1/article/`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
   [   
        {
         "id": "integer",
         "title": "string",
         "content": "string",
         "author": "string",
         "imageThumbnail": "string",
         "category": "string",
         "isShowing": "boolean",
         "createdAt": "Date",
         "updatedAt": "Date"
        },
        {
         "id": "integer",
         "title": "string",
         "content": "string",
         "author": "string",
         "imageThumbnail": "string",
         "category": "string",
         "isShowing": "boolean",
         "createdAt": "Date",
         "updatedAt": "Date"
         }
   ]
}
```
## Get Article Detail
Request:
- Method: GET
- Endpoint: `/api/v1/article/{id_article}`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "location": "string",
      "startDate": "date",
      "endDate": "date",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Update Acara
Request:
- Method: PUT
- Endpoint: `/api/v1/acara/{id_acara}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "title": "string",
  "content": "string",
  "author": "string",
  "location": "string",
  "startDate": "date",
  "endDate": "date",
  "imageThumbnail": "string",
  "category": "string",
  "isShowing": "boolean"
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
      "id": "integer",
      "title": "string",
      "content": "string",
      "author": "string",
      "location": "string",
      "startDate": "date",
      "endDate": "date",
      "imageThumbnail": "string",
      "category": "string",
      "isShowing": "boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
}
```
## Delete Acara
Request:
- Method: DELETE
- Endpoint: `/api/v1/acara/{id_acara}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string"
}
```
## Create Program Study

## Create Contact CS

## Create Gallery

## Create Calon Mahasiswa Baru

## Create Pengunjung Web
