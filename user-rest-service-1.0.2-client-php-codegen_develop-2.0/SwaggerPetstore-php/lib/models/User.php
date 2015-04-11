<?php
/**
 *  Copyright 2015 Reverb Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */



/**
 * User object
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */

namespace SwaggerPetstore\models;

use \ArrayAccess;

class User implements ArrayAccess {
  static $swaggerTypes = array(
      'id' => 'int',
      'name' => 'string',
      'photo' => 'array[string]',
      'categories' => 'array[Category]',
      'locations' => 'array[Location]'
  );

  static $attributeMap = array(
      'id' => 'id',
      'name' => 'name',
      'photo' => 'photo',
      'categories' => 'categories',
      'locations' => 'locations'
  );

  
  /**
  * ID of the user
  */
  public $id; /* int */
  /**
  * Name of the user
  */
  public $name; /* string */
  public $photo; /* array[string] */
  public $categories; /* array[Category] */
  public $locations; /* array[Location] */

  public function __construct(array $data = null) {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->photo = $data["photo"];
    $this->categories = $data["categories"];
    $this->locations = $data["locations"];
  }

  public function offsetExists($offset) {
    return isset($this->$offset);
  }

  public function offsetGet($offset) {
    return $this->$offset;
  }

  public function offsetSet($offset, $value) {
    $this->$offset = $value;
  }

  public function offsetUnset($offset) {
    unset($this->$offset);
  }
}

