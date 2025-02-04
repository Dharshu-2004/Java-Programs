public class AdjacencyMatrixGraph {
	public static void main (String[] args) {
		int v= 7;
		addedge(mat,0,1);
		addedge(mat,0,2);
		addedge(mat,1,4);
		addedge(mat,1,6);
		addedge(mat,0,3);
		addedge(mat,2,3);
		addedge(mat,3,6);
		addedge(mat,3,4);
		addedge(mat,4,5);
		addedge(mat,5,6);
		display(mat);
	}
	public static void addedge(int[][] mat, int i,int j) {
		mat[i][j]=1;
		mat[j][i]=1;
	}
	public static void display(int[][] mat) {
		for(int[] row:mat) {
			for(int val:row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}