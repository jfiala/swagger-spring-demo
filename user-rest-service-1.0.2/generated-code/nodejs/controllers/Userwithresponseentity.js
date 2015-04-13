'use strict';

var url = require('url');



var Userwithresponseentity = require('./UserwithresponseentityService');



module.exports.getUserResponseEntity = function getUserResponseEntity (req, res, next) {
  var id = req.swagger.params['id'].value;
  

  var result = Userwithresponseentity.getUserResponseEntity(id);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

