FORMAT: 1A

# Dead Drops

Dead Drops is a simple API allowing consumers to view and create dead drops to store messages

# Dead Drops API Root [/dead-drops]

Lists all dead drops available

## Retrieve the Entry Point [GET]

+ Request (application/json;charset=UTF-8)
+ Response 200 (application/json;charset=UTF-8)
    
        [
            { "name" : "abandoned-car", "message" : "the eagle has landed" },
            { "name" : "old-tree", "message" : "the squirrel is not home" }
        ]

## dead drop [/dead-drops/{name}]

+ Parameters
    + name (required, string, `abandoned-car`) ... name of dead drop

### View message of dead-drop [GET]
+ Request (application/json;charset=UTF-8)
+ Response 200 (application/json;charset=UTF-8)

        { "name" : "abandoned-car", "message" : "the eagle has landed" }
        
### Stores dead drop with message [PUT]

+ Request (application/json;charset=UTF-8)

        { "name" : "abandoned-car", "message" : "the eagle has landed" }
+ Response 204 

    
### Deletes new dead drop with message [DELETE]
+ Request (application/json;charset=UTF-8)
+ Response 204 
