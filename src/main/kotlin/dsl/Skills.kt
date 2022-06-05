package dsl

data class Skills(
    val skills: List<Skill>
)

sealed class Skill {
    abstract val title: String

    data class Soft(override val title: String) : Skill()
    data class Hard(override val title: String) : Skill()
}
