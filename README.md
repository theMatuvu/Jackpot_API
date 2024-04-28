API for a loyalty jackpot !

You can request API with Postman when the application is running on port 9000.
A Datapool with 4 customers is already available for test the application.
A test set is also available

You can get customer information with :
  localhost:9000/customer/{customer_id}
You can check if a customer's jackpot is available with :
  localhost:9000/customer/{customer_id}/isUnlocked

  example : 
  get customer information
  request : localhost:9000/customer/2
  response : {
    "id": 2,
    "lastname": "HOCHON",
    "firstname": "Paul",
    "jackpotamount": 4.0,
    "nbcheckout": 5
}

check if jackpot is available : 
request : localhost:9000/customer/2/isUnlocked
response : {
    "idCustomer": 2,
    "unlocked": false,
    "amount": 4.0,
    "checkout": 5,
    "message": "The amount of your jackpot is too low. "
}
