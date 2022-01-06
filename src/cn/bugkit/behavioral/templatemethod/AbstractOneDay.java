package cn.bugkit.behavioral.templatemethod;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public abstract class AbstractOneDay {


    /**
     * get person's one day life
     */
    public void oneDay() {
        getUp();
        eatBreakfast();
        takeTransportation();
        working();
    }

    protected abstract void working();

    protected abstract void takeTransportation();

    protected abstract void eatBreakfast();

    protected abstract void getUp();


}
