#### Story 1
**given**
   1 car ,1 parking boy
 **when**
    parking boy parking
 **then**
    return 1 ticket



 **given**
   1 ticket, 1 parking boy
 **when**
    parking boy fetching
 **then**
    return 1 car



 **given**
    2 car, 1 parking boy
 **when**
    parking boy parking
 **then**
    return 2 ticket



 **given**
    1 wrong ticket, 1 parking boy
 **when**
    parking boy fetching
 **then**
    return no ticket error tips



 **given**
    1 used ticket, 1 parking boy
 **when**
     parking boy fetching
 **then**
    return ticket used tips

 **given**
    1 car, 1 parking boy
 **when**
     parking boy parking
 **then**
    return null ticket


#### Story2
 **given**
    1 used ticket, parking boy
 **when**
     parking boy fetching
 **then**
    return Unrecognized tips
    
 **given**
     null ticket, parking boy
 **when**
      parking boy fetching
 **then**
     return please provide tips

 **given**
    1 car, 1 parking boy
 **when**
     parking boy parking
 **then**
    return no position tips
     