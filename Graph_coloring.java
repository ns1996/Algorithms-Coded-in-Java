import java.util.Scanner;
public class Graph_coloring {

 public static int store[];

 Graph_coloring(int all_nodes){
 store=new int [all_nodes];
 }

 public void coloring(int all_node,int all_colors,int ar[][]){
 for(int i=1;i<=all_node;i++){
 for(int j=1;j<=all_colors;j++){
 if(is_safe(all_node,ar,j,i)){
 store[i]=j;
 }
 }
 }
 }

 public boolean is_safe(int all_node,int ar[][],int color,int node){
 for(int i=1;i<=all_node;i++){
 if(ar[node][i]==1 && this.store[i]==color){
 return false; } }
 return true; }

 public static void main(String args[]){
 System.out.println("Enter No of Node ");
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 System.out.println("Enter No of Colors ");
 int m=in.nextInt();
 int arr[][]=new int[n+1][n+1];
 System.out.print("Enter no of edges\n");
 int t=in.nextInt();
 System.out.print("Enter edges\n");
 for(int i=0;i<t;i++){
 int x=in.nextInt();int y=in.nextInt();
 arr[x][y]=1;arr[y][x]=1;
 }
 Graph_coloring g=new Graph_coloring(n+1);
 g.coloring(n, m, arr);
 int res=store[0];
 for(int i=0;i<=n;i++){if(store[i]>res){res=store[i];}}
 System.out.println("Hence Maximum "+res+" colors will be required to color Graph"); }}