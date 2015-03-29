###
GET /dead-drops -> 200
DELETE /dead-drops/{name} -> 200
GET /dead-drops/{name} -> 200
POST /dead-drops/{name} -> 200
PUT /dead-drops/{name} -> 200
###

{before, after} = require 'hooks'

before 'GET /deadrops/old-tree -> 200', (test, done) ->
  done()

after 'GET /dead-drops/old-tree -> 200', (test, done) ->
  machine = test.response.body[0]
  console.log machine.name
  done()