# Library-Store

# Overview
   * So apparently I am going to discuss the flow here about the task, I tried to apply a scalable structure so it can be modified anytime.
   * I didn't use database, but instead I created a function which define objects that will be created when needed.
   * The structure of the controller is kinda normal, so we are going to move on with "Services".
     * UserService: the "UserService" contains two main functions one for "buy" and the other for "borrow",
     * BookService: the "BookService" contains three main functions "findBookByName" ,"findBookByAuthor", and "findBookIsBorrowable"
        
   * there is other separate functions used in the main Service classes implemented in "BookServiceRestrictions" class:
     * 1- "simulateDatabaseReturnCartBuyOrBorrow": simulates the database retrieve data of a "Cart".
     * 2- "simulateDatabaseReturnListAllBooks": simulates the database retrieve the whole "Books" data.
     * 3- "isBorrowable": checks if the book is borrowable or at least there is more than one copy of it.
     * 4- "isExist": check is the book at least there is one copy of it.


     
# Requests
  Just follow this structure on Postman
  ----------------------------------------------------------------------------------------------------------------------------
    Endpoint Definition           |  Request Type  |                     URL                   |            Params           
  ----------------------------------------------------------------------------------------------------------------------------
    1- Buy Cart                   |      POST      | http://localhost:8080/user/buy            |
    2- Borrow Cart                |      POST      | http://localhost:8080/user/borrow         |
  ----------------------------------------------------------------------------------------------------------------------------
    1- Find Book By Name          |      POST      | http://localhost:8080/books/findByName    |  (RequestHeader: bookName)
    2- Find Book By Author        |      POST      | http://localhost:8080/books/findByAuthor  |  (RequestHeader: authorName)
    3- Find Book By isBorrowable  |      POST      | http://localhost:8080/books/isBorrowable  |
  ----------------------------------------------------------------------------------------------------------------------------
