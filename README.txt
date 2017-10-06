Christopher Hernandez
phone: 708-821-6464
teammates: none

June 30th, 2016
CS-445 Project
Omar Aldawud

*written in notepad++; for best viewing use Notepad++ or Microsoft Word

Step 1.)

Download the eclipse project files and jar file

Step 2.)

Run the project, either

IDE:
Open the project in eclipse and run the project

CMD:
1.) Open a command prompt and cd into the directory of the downloaded files.
2.) $ java -jar Project.jar

Step 3.)

Running the project:

When the project runs it will ask if you have an account.

Answering yes will cause the program to prompt you for a username and password. Bob is our employee and his password is 123. Type

$ Bob
$ 123

to login as Bob. You will then see the available inventory and be prompted to perform CRUD (R is being done automatically, you may do CUD).
You will be prompted to choose an item via it’s number.
After selecting an item number you will be asked what operation you want to perform on that item (add, delete, etc.)
This process is intuitive, i.e. press a to add another of the selected item, d to delete, etc.

Any login besides Bob's will result in the user logging in as a customer and continuing on to the shopping section.

Answering no when asked if you have an account will prompt the program to ask if you would like to make an account.

If you say yes you will be guided through registration via a series of prompts. Afterwards your new account will be briefly displayed
and you will continue on to the shopping section.

Answering no when asked if you would like to create an account will lead you on to the shopping section as an unregistered
user.

The shopping section:

The available stock will show, and you will be prompted to input the number corresponding to your desired item.
Once an item is selected, it's information will display again for convenience and you will be asked whether or
not you want to add that item to your cart or return to the main menu.
If you choose to add the item to your cart you will be asked if you want to checkout.
If you choose to checkout, you will be led to checkout. If you choose not to checkout you will be asked if you want to continue shopping.

If you choose to checkout you will be shown a grand total of all the item prices in your cart and asked to enter your card number, and then
your address. Your order details will then be displayed. At this point you will be asked to submit your order or continue shopping. If you
submit the order the order will ship, and a confirmational display will show. You will then be asked if you would like to continue shopping.

Declining to continue shopping at any point will cause the program to wish you a nice day and end.