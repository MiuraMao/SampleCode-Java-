interface PublicMethod {
    void disp();
}
class DropPublicModifier implements PublicMethod {
    @Override
    void disp() {   //interface�̃A�N�Z�X�C���qpublic������I�Ȃ��߃R���p�C���G���[
        System.out.println("disp called");  
    }
}
