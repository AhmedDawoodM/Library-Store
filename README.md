# Library-Store

Requests
  ------------------------------------------------------------------------------------------------------------------------------------
    Endpoint Definition           |  Request Type  |                    URL                        |            Params
  ------------------------------------------------------------------------------------------------------------------------------------
    1- Buy Cart                   |      POST      |     http://localhost:8080/user/buy            |
    2- Borrow Cart                |      POST      |     http://localhost:8080/user/borrow         |
  ------------------------------------------------------------------------------------------------------------------------------------
    1- Find Book By Name          |      POST      |     http://localhost:8080/books/findByName    |  (RequestHeader: bookName)
    2- Find Book By Author        |      POST      |     http://localhost:8080/books/findByAuthor  |  (RequestHeader: authorName)
    3- Find Book By isBorrowable  |      POST      |     http://localhost:8080/books/isBorrowable  |
  ------------------------------------------------------------------------------------------------------------------------------------
