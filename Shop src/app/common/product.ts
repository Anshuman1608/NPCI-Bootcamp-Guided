// "id" : 1003,
//       "sku" : "MDN-5003",
//       "name" : "AC",
//       "description" : "This is a air conditioner",
//       "unitprice" : 35000.0,
//       "imageurl" : "https://os-wordpress-media.s3.ap-south-1.amazonaws.com/blog/wp-content/uploads/2020/11/24212247/Air-Conditioner-Buying-Guide.jpg",
//       "active" : 0,
//       "unitinstock" : 15,
//       "datecreated" : "2019-12-24T18:30:00.000+00:00",
//       "lastupdated" : "2022-06-10T18:30:00.000+00:00",
//       "categoryid" : 3,
export class Product {
  constructor(
    public id : number,
    public sku : string,
    public name : string,
    public description : string,
    public unitprice : number,
    public imageurl : string,
    public active : number,
    public unitinstock : number,
    public datecreated : string,
    public lastupdated : string,
    public categoryid : number
  ){}
}
