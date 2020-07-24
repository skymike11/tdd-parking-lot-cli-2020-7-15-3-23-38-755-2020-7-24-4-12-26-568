# PDCA

#### PDCA - story1

| function                                                 | P     | D     | C    | A    |      |
| -------------------------------------------------------- | ----- | ----- | ---- | ---- | ---- |
| 初始化gradle项目，阅读story1的AC，根据AC首先编写testcase | 15min | 18min |      |      |      |
| 根据testcase 进行测试用例的编写                          |       |       |      |      |      |
| 完成停一台车，生成一张票的用例与实现                     | 10min | 10min |      |      |      |
| 完成根据票取车的用例与实现                               | 10min | 10min |      |      |      |
| 完成停车没位子返回null的用例与实现                       | 11min | 10min |      |      |      |
| 完成空票取车的用例与实现                                 | 9min  | 9min  |      |      |      |
|                                                          |       |       |      |      |      |



#### PDCA - story2

| function                                 | P     | D     | C    | A    |      |
| ---------------------------------------- | ----- | ----- | ---- | ---- | ---- |
| 阅读story2的AC，根据AC首先编写testcase   | 10min | 11min |      |      |      |
| 根据testcase 进行测试用例的编写          |       |       |      |      |      |
| 完成票不存在或者票已经使用过的用例和实现 | 13min | 12min |      |      |      |
| 完成提示需要提供车票的用例与实现         | 11min | 10min |      |      |      |
| 完成提示没位子了的用例与实现             | 10min | 10min |      |      |      |



#### PDCA - story3

| function                               | P     | D     | C    | A    |      |
| -------------------------------------- | ----- | ----- | ---- | ---- | ---- |
| 阅读story3的AC，根据AC首先编写testcase | 10min | 10min |      |      |      |
| 根据testcase 进行测试用例的编写        |       |       |      |      |      |
| 完成按顺序停车的用例和实现             | 13min | 12min |      |      |      |
| 完成提示需要提供车票的用例与实现       | 11min | 10min |      |      |      |
| 完成提示没位子了的用例与实现           | 10min | 10min |      |      |      |

#### PDCA - story4

| function                               | P     | D     | C    | A    |      |
| -------------------------------------- | ----- | ----- | ---- | ---- | ---- |
| 阅读story3的AC，根据AC首先编写testcase | 10min | 10min |      |      |      |
| 根据testcase 进行测试用例的编写        |       |       |      |      |      |
| 完成按停车场数量剩余停车的用例和实现   | 15min | 13min |      |      |      |

#### PDCA - story5

| function                               | P     | D     | C    | A    |      |
| -------------------------------------- | ----- | ----- | ---- | ---- | ---- |
| 阅读story3的AC，根据AC首先编写testcase | 10min | 10min |      |      |      |
| 根据testcase 进行测试用例的编写        |       |       |      |      |      |
| 完成按顺序停车场使用率的用例和实现     | 15min | 15min |      |      |      |



# CLI Version

Please read the story and do your implementation.

## Story 1

As a customer, I would like to give my car to a parking boy so that he can help me park a car to the parking lot.

AC1: The parking boy can park a car into the parking lot and returns a parking ticket. The customer can give the parking ticket back to the parking boy to fetch the car.

AC2: The parking boy can park multiple cars into on parking lot. And can fetch right car using correspond ticket.

AC3: If the customer gives a wrong ticket (the parking boy does not provide the ticket) or does not give a ticket. Then no car should be fetched.

AC4: If the customer gives a ticket that has already been used. Then no car should be fetched.

AC5: The parking lot has a capacity (the default capacity of a parking lot is 10). If there is no position, then the user cannot park the car into it. Thus (s)he will not get any ticket.

> There are some cases which are not a requirement but may happen technically 
>
> * Passing a parked car to a parking boy.
> * Passing a `null` car to a parking boy.

## Story 2

As a customer, I would like to get some response message from the parking boy when I cannot fetch the car. So that I can know what happens.

AC1: When the customer gives a wrong ticket (the parking boy does not provide the ticket / the ticket has been used). Then no car should be fetched. If I query the error message, I can get an "Unrecognized parking ticket.".

AC2: When the customer does not provide a ticket when fetching a  car. The error message should be "Please provide your parking ticket."

AC3: When the parking boy attempt to park a car into a parking lot without a position. The error message should be "Not enough position."

## Story 3

As a parking lots service manager, I would like to have a parking boy parking cars to multiple parking lots. So that I can provide more parking positions.

AC1. The parking boy is not that clever, and he will always park cars sequentially (suppose that there are two parking lots managed by the parking boy. The parking boy will park cars to the second parking lot when the first parking lot is full).

AC2: All the requirement in *Story 1* and *Story 2* **MUST** be satisfied.

## Story 4

As a parking lots service manager. I would like to have another kind of parking boy to help me parking cars to multiple parking lots. So that the parking positions can be better used.

The new kind of parking boy is called **SMART PARKING BOY**.

AC1. The smart parking boy will always park cars to the parking lot which contains more empty positions.

AC2: All the requirement in *Story 1* and *Story 2* **MUST** be satisfied.

## Story 5

As a parking lots service manager, I would like to have another kind of parking boy to help me parking cars to multiple parking lots so that the parking positions can be better used.

The new kind of parking boy is called **SUPER SMART PARKING BOY**.

AC1. The super smart parking boy will always park cars to the parking lot which has a larger available position rate (*positions available* / *total capacity*).

AC2: All the requirement in *Story 1* and *Story 2* **MUST** be satisfied.

## Story 6

As a parking lot service manager, I would like to manage several parking boys (including all three kinds of parking boys). And at the same time, I can act as a standard parking boy too. So that our work can be most efficient.

Each parking lot service will have only one manager.

AC1. The parking lot service manager can add parking boys to management list. And the parking lot manager can specify a parking boy on the list to park or fetch the car (only from the parking lots managed by that parking boy).

AC2. The parking lot service manager can also manage parking lots. And (s)he can park or fetch the car just as a standard parking boy (*Story 3*). Note that (s)he can only store and fetch the car from his/her own parking lots.

AC3. If the manager tells the parking boy to park or fetch the car, then the manager should be able to display the error message to the customer if the parking boy failed to do the operation.