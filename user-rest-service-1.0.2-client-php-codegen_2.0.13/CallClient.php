<?php
require_once("Swagger.php");
require_once("UserApi.php");
require_once("SearchApi.php");
require_once("models/User.php");

$apiServer = "http://localhost:8080";
$apiKey = "";

$apiClient = new APIClient("http://localhost:8080", "");
$userApi = new UserApi($apiClient);
var_dump($userApi->getUser(1));


$searchApi = new SearchApi($apiClient);
var_dump($searchApi->searchUsers("T"));


?>