'use strict';

var url = require('url');



var Usercompletepostcomplete = require('./UsercompletepostcompleteService');



module.exports.saveUserComplete = function saveUserComplete (req, res, next) {
  var id = req.swagger.params['id'].value;
  var user = req.swagger.params['user'].value;
  

  var result = Usercompletepostcomplete.saveUserComplete(id, user);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

