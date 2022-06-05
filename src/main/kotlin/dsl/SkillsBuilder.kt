package dsl

class SkillsBuilder {
    private val skills = mutableListOf<Skill>()

    fun soft(title: String) {
        skills.add(Skill.Soft(title))
    }

    fun hard(title: String) {
        skills.add(Skill.Hard(title))
    }

    fun build(): Skills {
        return Skills(skills.toList())
    }
}
