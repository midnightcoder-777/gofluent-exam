# Welcome to GoFluent Basket!

This is readme for the coding exercise


# Technology Used

**Java**

**TypeScript**

**Spring boot**

**Maven**

**Angular**

**Yarn**

**Node.js**

**GiT**

**MySql**

## Start up

Clone Repository
**git repo url**

**Backend**
- create schema  name: **shopping**
- build shopping-basket as spring boot maven prject
- hit endpoints: 
     http://localhost:8081/api/v1/gofluent/basket
         header: Content-Type - application/json
	 
         body: 
	 
	        {
			"id": 1,
		  	"totalPrice": 0.0,
		  	"items": []
		 	} 

     http://localhost:8081/api/v1/gofluent/items
	 header: Content-Type - application/json
	 
         body: 
	
	        [{
			"id":1,
			"itemDescription":"Loren Ipsum1",
			"itemName":"Item1",
			"itemPrice":100.0
			},
			{
			"id":2,
			"itemDescription":"Loren Ipsum2",
			"itemName":"Item2",
			"itemPrice":200.0
			},
			{
			"id":3,
			"itemDescription":"Loren Ipsum3",
			"itemName":"Item3",
			"itemPrice":300.0
			},
			{
			"id":4,
			"itemDescription":"Loren Ipsum4",
			"itemName":"Item4",
			"itemPrice":400.0
			},
			{
			"id":5,
			"itemDescription":"Loren Ipsum5",
			"itemName":"Item5",
			"itemPrice":500.0
		 }]
				
**Frontend**
- download and intalls **node.js** (https://nodejs.org/en/download/)
- download and intalls **yarn** (https://classic.yarnpkg.com/en/docs/install/#windows-stable)
- intall **Angular**: *npm install -g @angular/cli*
- set yarn as package manager : *ng config -g cli.packageManager yarn*
- run angular app : *npm start*
- go to http://localhost:4200/
