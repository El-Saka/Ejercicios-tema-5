public class CocheCRUDImpl implements CocheCRUD{

    /**
     *
     */
    @Override
    public void save() {
        System.out.println("Guardar método llamado");
    }

    @Override
    public void findAll() {
        System.out.println("Método FindAll llamado");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar método llamado");

    }

    @Override
    public void deelete() {
        System.out.println("Eliminar método llamado");
    }
}
