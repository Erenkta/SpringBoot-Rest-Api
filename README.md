
# Rest Api Tutorial For Java & Spring Boot

Bu projede Java ve Spring Boot kullanarak CRUD işlemlerini gerçekleştirebileceğim endpointler oluşturdum. Ayrıca endpointlerimi ve book için oluşturduğum service class'ını unit test ve integration testlerle destekledim ve testing konusuna da bir giriş yapmış oldum.

## API Kullanımı


| Parametre | Tip     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `isbn`      | `string` | **Gerekli**. Çağrılacak öğenin anahtar değeri |


#### Tüm öğeleri getir

```http
  GET /books
```
#### isbn'e göre öğeyi getir
```http
  GET /books/${isbn}
```
#### Öğeyi oluştur ya da güncelle
```http
  PUT /books/${isbn}
```

#### Öğeyi sil
```http
  DELETE /books/${isbn}
```







  