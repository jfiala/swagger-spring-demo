'use strict';

var url = require('url');



var User = require('./UserService');



module.exports.getUser = function getUser (req, res, next) {
  var id = req.swagger.params['id'].value;
  

  var result = User.getUser(id);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};


module.exports.saveUser = function saveUser (req, res, next) {
  var id = req.swagger.params['id'].value;
  var name = req.swagger.params['name'].value;
  

  var result = User.saveUser(id, name);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

