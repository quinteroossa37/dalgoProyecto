package Algoritmos;

public class Problema1 {

	public static int[] ro(int[] a, int p, int q, int k){
		int j,m;
		if(k<0){
			k=-k;
			m=(q-p)-k%(q-p);
		}
		else{
			m=k%(q-p);
		}
		int[] x = new int[a.length];
		for(int i=0;i<a.length;i++){
			x[i]=a[i];
		}
		for(int i=p;i<q;i++){
			j=i+m;
			if(j<q && j>=p){
				x[j]=a[i];
			}
			else{
				j=(i+m)%q+p;
				x[j]=a[i];
			}
		}
		return x;
	}

	public int[] re(int[] a, int p, int q){
		int j,m;
		m = (q-p)-(1%(q-p));
		int[] x = new int[a.length];
		for(int i=0;i<a.length;i++){
			x[i]=a[i];
		}
		for(int i=0;i<(q-p);i++){
			j=-i+m;
			if(j<q-p && j>=0){
				x[p+j]=a[p+i];
			}
			else{
				j=(i+m)%(q-p);
				x[p+j]=a[p+i];
			}
		}
		return a;
	}
}

