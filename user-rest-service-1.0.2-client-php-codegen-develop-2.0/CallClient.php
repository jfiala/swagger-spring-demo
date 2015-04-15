<?php

use SwaggerPetstore\ConnectorfacebookuserApi;

use SwaggerPetstore\APIClient;
use SwaggerPetstore\UserApi;

require("SwaggerPetstore-php/SwaggerPetstore.php");

$apiClient = new APIClient("http://localhost:8080", "");

$userApi = new UserApi($apiClient);
$user = $userApi->getUser(1);
var_dump($user);



?>
