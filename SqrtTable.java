//�����������߂�
class SqrtTable {
    public static void main(String[] args) {
        double res;
        for(double val=1.0; val <= 5.0; val++) {
            res=Math.sqrt(val);     //���w�֐��i�N���X���\�b�h�̌Ăяo���j
            System.out.printf("val=%3.1f res=%7.4f\n",val,res);
        }
    }    
}
