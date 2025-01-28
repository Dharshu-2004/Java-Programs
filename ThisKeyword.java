class ThisKeyword{
    int a=89;
    static int b=10;
    void zuzu(){
        this.a=55;
        this.b=45;
        System.out.println(a);
        System.out.println(b);
    }


	public static void main(String[] args) {
		Main obj=new Main();
		obj.zuzu();
}
}