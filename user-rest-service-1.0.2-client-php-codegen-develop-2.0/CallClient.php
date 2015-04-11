<?php

use SwaggerPetstore\APIClient;
use SwaggerPetstore\UserApi;

require("SwaggerPetstore-php/SwaggerPetstore.php");

$apiClient = new APIClient("http://localhost:8080", "");
$userApi = new UserApi($apiClient);
var_dump($userApi->getUser(1));


?>
