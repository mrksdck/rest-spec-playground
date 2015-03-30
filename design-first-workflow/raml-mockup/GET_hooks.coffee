###
GET /dead-drops -> 200
DELETE /dead-drops/{name} -> 200
GET /dead-drops/{name} -> 200
POST /dead-drops/{name} -> 200
PUT /dead-drops/{name} -> 200
###

{before, after} = require 'hooks'

before 'GET /deadrops/{name} -> 200', (test, done) ->
  test.request.path = '/deadrops/abandoned-car'
  done()

after 'GET /dead-drops/{name} -> 200', (test, done) ->
  machine = test.response.body[0]
  console.log machine.name
  done()