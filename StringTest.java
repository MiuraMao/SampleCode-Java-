class StringTest {
    public static void main(String [] args) {
        String s1=new String("abcdefg");
        String s2=new String("abcdefg");
        String s3=new String("����������");
        System.out.println("������F"+s1);
        System.out.println("�R�Ԗڂ̕����F"+s1.charAt(3));
        System.out.println(s1+"��"+s2+"�̔�r�F"+s1.compareTo(s2)); //�����I�ɑO�ɂ���ꍇ�͕����A��ɂ���ꍇ�͐����i�����̓R�[�h���j
        System.out.println(s1+"��"+s3+"�̔�r�F"+s1.compareTo(s3));
        System.out.println(s1+"��"+s3+"�̌����F"+s1.concat(s3));
        System.out.println(s1+"��"+"def�͊܂܂�邩�F"+s1.contains("def"));
        System.out.println(s1+"��"+s2+"�͓��e���������F"+s1.contentEquals(s2));
        System.out.println(s1+"��"+s2+"�͓����I�u�W�F�N�g�F"+s1.equals(s2));
        String s4=String.format(s3+"�̕�������"+s3.length());
        System.out.println(s4);
        System.out.println(s3+"���Łu���v��"+s3.indexOf('��')+"������");
        System.out.println(s3+"�́u���v���u���v�ɒu��������F"+s3.replace('��','��'));
        System.out.println(s1+"��啶���ɕϊ��F"+s1.toUpperCase());
    }    
}
