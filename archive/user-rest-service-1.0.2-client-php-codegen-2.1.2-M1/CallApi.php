<?php
require_once("Swagger.php");
require_once("UserApi.php");
require_once("models/User.php");

$apiServer = "http://localhost:8080";
$apiKey = "";

$apiClient = new APIClient("http://localhost:8080", "");
$userApi = new UserApi($apiClient);
$user = $userApi->getUser(1);
var_dump($user);


$searchApi = new SearchApi($apiClient);
$users = $searchApi->searchUsers("T");
var_dump($users);


?>