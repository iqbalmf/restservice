# API Specification

## Create User

Request:
- Method: POST
- Endpoint: `/api/v1/userAdmin/signup`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "userId": "String, Unique",
  "userName": "string",
  "userPass": "string",
  "userMail": "string",
  "userRole": "String",
  "isActive": "Boolean",
  "userUrl": "String"
}
```
Response:
```json
{
    "status": "integer",
    "info": "string",
    "content": {
        "id": "Integer",
        "userId": "String, Unique",
        "userName": "string",
        "userPass": "string",
        "userMail": "string",
        "userRole": "String",
        "isActive": "Boolean",
        "userUrl": "String",
        "createdAt": "Date",
        "updatedAt": "Date"
    }
}
```
## GET LIST USER
Request:
- Method: GET
- Endpoint: `/api/v1/userAdmin/`
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
              "id": "Integer",
                      "userId": "String, Unique",
                      "userName": "string",
                      "userPass": "string",
                      "userMail": "string",
                      "userRole": "String",
                      "isActive": "Boolean",
                      "userUrl": "String",
                      "createdAt": "Date",
                      "updatedAt": "Date"
        },
        {
              "id": "Integer",
                      "userId": "String, Unique",
                      "userName": "string",
                      "userPass": "string",
                      "userMail": "string",
                      "userRole": "String",
                      "isActive": "Boolean",
                      "userUrl": "String",
                      "createdAt": "Date",
                      "updatedAt": "Date"
        }
   ]
}
```
## UPDATE USER
Request:
- Method: PUT
- Endpoint: `/api/v1/userAdmin/{id}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "userId": "String, Unique",
  "userName": "string",
  "userPass": "string",
  "userMail": "string",
  "userRole": "String",
  "isActive": "Boolean",
  "userUrl": "String"
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": {
        "id": "Integer",
                "userId": "String, Unique",
                "userName": "string",
                "userPass": "string",
                "userMail": "string",
                "userRole": "String",
                "isActive": "Boolean",
                "userUrl": "String",
                "createdAt": "Date",
                "updatedAt": "Date"
      }
}
```
## DELETE USER
Request:
- Method: DELETE
- Endpoint: `/api/v1/userAdmin/{id}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": null
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
  "acaraId": "String, Unique",
  "acaraTitle": "string",
  "acaraContent": "string",
  "acaraAuthor": "string",
  "location": "string",
  "startDate": "date",
  "endDate": "date",
  "thumbnail": "string",
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
      "id": "long",
        "acaraId": "String, Unique",
        "acaraTitle": "string",
        "acaraContent": "string",
        "acaraAuthor": "string",
        "location": "string",
        "startDate": "date",
        "endDate": "date",
        "thumbnail": "string",
        "category": "string",
        "isShowing": "boolean",
      "createdAt": "date",
      "updatedAt": "date"
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
                "id": "long",
                  "acaraId": "String, Unique",
                  "acaraTitle": "string",
                  "acaraContent": "string",
                  "acaraAuthor": "string",
                  "location": "string",
                  "startDate": "date",
                  "endDate": "date",
                  "thumbnail": "string",
                  "category": "string",
                  "isShowing": "boolean",
                "createdAt": "date",
                "updatedAt": "date"
        },
        {
                "id": "long",
                  "acaraId": "String, Unique",
                  "acaraTitle": "string",
                  "acaraContent": "string",
                  "acaraAuthor": "string",
                  "location": "string",
                  "startDate": "date",
                  "endDate": "date",
                  "thumbnail": "string",
                  "category": "string",
                  "isShowing": "boolean",
                "createdAt": "date",
                "updatedAt": "date"
        }
   ]
}
```
## Get Acara Detail
Request:
- Method: GET
- Endpoint: `/api/v1/acara/{id}`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
            "id": "long",
              "acaraId": "String, Unique",
              "acaraTitle": "string",
              "acaraContent": "string",
              "acaraAuthor": "string",
              "location": "string",
              "startDate": "date",
              "endDate": "date",
              "thumbnail": "string",
              "category": "string",
              "isShowing": "boolean",
            "createdAt": "date",
            "updatedAt": "date"
    }
}
```
## Update Acara
Request:
- Method: PUT
- Endpoint: `/api/v1/acara/{id}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "acaraId": "String, Unique",
  "acaraTitle": "string",
  "acaraContent": "string",
  "acaraAuthor": "string",
  "location": "string",
  "startDate": "date",
  "endDate": "date",
  "thumbnail": "string",
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
           "id": "long",
             "acaraId": "String, Unique",
             "acaraTitle": "string",
             "acaraContent": "string",
             "acaraAuthor": "string",
             "location": "string",
             "startDate": "date",
             "endDate": "date",
             "thumbnail": "string",
             "category": "string",
             "isShowing": "boolean",
           "createdAt": "date",
           "updatedAt": "date"
    }
}
```
## Delete Acara
Request:
- Method: DELETE
- Endpoint: `/api/v1/acara/{id}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": null
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
  "articleId": "String, unique",
  "articleTitle": "string",
  "articleContent": "string",
  "articleAuthor": "string",
  "articleThumbnail": "string",
  "articleCategory": "string",
  "isShowing": "boolean",
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": {
        "id": "long",
        "articleId": "String, unique",
        "articleTitle": "string",
        "articleContent": "string",
        "articleAuthor": "string",
        "articleThumbnail": "string",
        "articleCategory": "string",
        "isShowing": "boolean",
        "createdAt": "date",
        "updatedAt": "date"
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
        "id": "long",
        "articleId": "String, unique",
        "articleTitle": "string",
        "articleContent": "string",
        "articleAuthor": "string",
        "articleThumbnail": "string",
        "articleCategory": "string",
        "isShowing": "boolean",
        "createdAt": "date",
        "updatedAt": "date"
        },
        {
        "id": "long",
        "articleId": "String, unique",
        "articleTitle": "string",
        "articleContent": "string",
        "articleAuthor": "string",
        "articleThumbnail": "string",
        "articleCategory": "string",
        "isShowing": "boolean",
        "createdAt": "date",
        "updatedAt": "date"
         }
   ]
}
```
## Get Article Detail
Request:
- Method: GET
- Endpoint: `/api/v1/article/{id}`
- Header: 
    - Content-Type: application/json
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
        "id": "long",
        "articleId": "String, unique",
        "articleTitle": "string",
        "articleContent": "string",
        "articleAuthor": "string",
        "articleThumbnail": "string",
        "articleCategory": "string",
        "isShowing": "boolean",
        "createdAt": "date",
        "updatedAt": "date"
    }
}
```
## Update Acara
Request:
- Method: PUT
- Endpoint: `/api/v1/acara/{id}`
- Header: 
    - Content-Type: application/json
    - Accept: application/json
- Body: 
```json
{
  "articleId": "String, unique",
  "articleTitle": "string",
  "articleContent": "string",
  "articleAuthor": "string",
  "articleThumbnail": "string",
  "articleCategory": "string",
  "isShowing": "boolean",
}
```
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": 
    {
        "id": "long",
        "articleId": "String, unique",
        "articleTitle": "string",
        "articleContent": "string",
        "articleAuthor": "string",
        "articleThumbnail": "string",
        "articleCategory": "string",
        "isShowing": "boolean",
        "createdAt": "date",
        "updatedAt": "date"
    }
}
```
## Delete Acara
Request:
- Method: DELETE
- Endpoint: `/api/v1/acara/{id}`
- Header: 
    - Content-Type: application/json
    
Response:
```json
{
  "status": "integer",
  "info": "string",
  "content": null
}
```
## Create Program Study

## Create Contact CS

## Create Gallery

## Create Calon Mahasiswa Baru

## Create Pengunjung Web
