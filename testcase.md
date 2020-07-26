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
    
    
 #### Story3
 **given**
    1 car, 1 parking boy, 1 full parkinglot, 1 unfull parkinglot
 **when**
     parking boy parking
 **then**
    return ticket 
 
  #### Story4
  **given**
     1 car, 1 parking boy, 1 full parkinglot, 1 unfull parkinglot
  **when**
      parking boy parking
  **then**
     return ticket
     
  #### Story5
  **given**
     1 car, 1 parking boy, 1 full parkinglot, 1 unfull parkinglot
  **when**
      parking boy parking
  **then**
     return ticket 

  #### Story6
  **given**
     1 parkingLotManager, 1 parkingBoy, 
  **when**
      Join in management 
  **then**
     return true member's number 
     
  **given**
     1 parkingLotManager, 1 parkingBoy id, 1 car, 
  **when**
      assign parkingboy to parking
  **then**
     return success tip
     
  **given**
     1 parkingLotManager,  1 token, 
  **when**
      assign parkingboy to parking
  **then**
     return car
     
  **given**
     1 parkingLotManager,  1 car, 
  **when**
      manager to parking
  **then**
     return ticket   