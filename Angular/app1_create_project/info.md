# Setup 

## 1. Install node

Get the latest version [here](https://nodejs.org/en/download). Current latest `18.16.0`


## 2. Check for the Latest version
Open cmd and check for the node version. [current latest : 18.16.0]

`command` 
```
node --version
>18.16.0
``` 
```
npm --version
>9.6.6
```


## 3. Install Angular
Open a command prompt and move to **Directory** you want to create your **Angular Project**.

`command` 
```
C:\Users\[user_name]>D:

D:\>cd [path_to_your_directory]

D:\[path_to_your_directory]>_

D:\[path_to_your_directory]>npm -g install  @angular/cli
```
-g : global | installs golbaly


## 4. Create **New Project**

`command` 
```
D:\[path_to_your_directory]>ng new [Project_name]
```


## 5. Start the Project
Go to the project folder

`command` 
```
D:\[path_to_your_directory]>cd [Project_name]
```
Start the server

`command` 
```
D:\[path_to_your_directory]\[Project_name]>ng serve
```


>Open the browser and go to the link `localhost:4200`.


## 6. Create a **New Component**

In the same [Project_name] dirctory.

`command`
```
D:\[path_to_your_directory]\[Project_name]>ng generate component [component_name]
```
or
```
D:\[path_to_your_directory]\[Project_name]>ng g c [component_name]
```