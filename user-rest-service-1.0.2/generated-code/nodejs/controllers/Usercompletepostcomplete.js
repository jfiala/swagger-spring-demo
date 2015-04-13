'use strict';

var url = require('url');



var Usercompletepostcomplete = require('./UsercompletepostcompleteService');



module.exports.saveUserComplete = function saveUserComplete (req, res, next) {
  var body = req.swagger.params['body'].value;
  

  var result = Usercompletepostcomplete.saveUserComplete(body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

