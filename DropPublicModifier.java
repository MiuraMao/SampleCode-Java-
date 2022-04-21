interface PublicMethod {
    void disp();
}
class DropPublicModifier implements PublicMethod {
    @Override
    void disp() {   //interfaceのアクセス修飾子publicより限定的なためコンパイルエラー
        System.out.println("disp called");  
    }
}
