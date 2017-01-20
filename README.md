Code for Assignment of orders to executives

Problem Statement 
1. To assign orders to executives based on first mile distance , processing time and executive waiting time parameters

Discussed assumptions
1. Batch assignment i.e to match 100 orders to 100 executives assuming that sufficient number of executives are available
2. Single threaded implementation run by a cron of fixed time interva

Implemented Solution 
1. Represent orders and executives as two types of vertices of a graph
2. Linearize the distance and time factors as weightage of edges between orders and executives
3. Run bi-partite matching on the graph to get efficient solution for the batch

Notes
1. Due to limited time and scope , the design makes extensive use of interfaces which act as stubs for the underlying implementations.
2. The bi-partite algorithm itself is stubed out assuming that an appropriate graph library can be plugged in
3. Assignment\BipartiteMatchingAssigner is the major business class that manages the assignments calling the interfaces as required.
4. Have tried to cover one example for each aspect like exception handling , dependency injection and generics which needs to be expanded further.
