'use strict';

var url = require('url');



var Search = require('./SearchService');



module.exports.searchUsers = function searchUsers (req, res, next) {
  var query = req.swagger.params['query'].value;
  

  var result = Search.searchUsers(query);

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
  

  var result = Search.saveUser(id, name);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

