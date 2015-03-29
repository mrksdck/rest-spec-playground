FORMAT: 1A

# Dead Drops

Dead Drops is a simple API allowing consumers to view and create dead drops to store messages

# Dead Drops API Root [/dead-drops]

Lists all dead drops available

## Retrieve the Entry Point [GET]

+ Request (application/json;charset=UTF-8)
+ Response 200 (application/json;charset=UTF-8)
    
        [
            "car","tire"        
         ]

## dead drop [/dead-drops/{name}]

+ Parameters
    + name (required, string, `car`) ... name of dead drop

### View message of dead-drop [GET]
+ Request (application/json; charset=UTF-8)
+ Response 200 (application/json; charset=UTF-8)

        "the eagle has landed"
+ Response 404
    
### Add new dead drop with message [POST]

+ Request (application/json; charset=UTF-8)

        "the squirrel is not home"

+ Response 200

### Updates dead drop with message [PUT]

+ Request (application/json; charset=UTF-8)

        "be right back"

+ Response 200 

    
### Deletes new dead drop with message [DELETE]
+ Request (application/json;charset=UTF-8)
+ Response 200 
