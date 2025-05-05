package javacodes.graph;

public class Main {
    public static void main(String[] args){
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.printGraph();

        System.out.println("After adding edges");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("A","D");
        myGraph.addEdge("B","D");
        myGraph.addEdge("C","D");
        myGraph.printGraph();

        System.out.println("After removing edges");
        myGraph.removeEdge("A","B");
        myGraph.printGraph();

        System.out.println("After removing vertex");
        myGraph.removeVertex("D");
        myGraph.printGraph();

    }
}
