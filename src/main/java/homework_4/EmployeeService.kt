package homework_4

import java.math.BigDecimal

open class EmployeeService {
    fun initEmployee(): List<Employee>{
        val list = ArrayList<Employee>()
        for (i: Long in 1L..6L) {
            list.add(Employee(i, "Unnamed", BigDecimal(i).multiply(BigDecimal(10000))))
        }
        return list
    }
}