package dsl

class PersonBuilder {
    private lateinit var name: String
    private var company: String? = null
    private var skills: Skills? = null
    private var languages: Languages? = null

    private val skillsBuilder: SkillsBuilder = SkillsBuilder()
    private val languagesBuilder: LanguagesBuilder = LanguagesBuilder()

    fun name(value: String) {
        name = value
    }

    fun company(value: String) {
        company = value
    }

    fun skills(block: SkillsBuilder.() -> Unit) {
        skills = skillsBuilder.apply(block).build()
    }

    fun languages(block: LanguagesBuilder.() -> Unit) {
        languages = languagesBuilder.apply(block).build()
    }

    fun build(): Person {
        return Person(name, company, skills, languages)
    }
}

fun introduce(block: PersonBuilder.() -> Unit): Person {
    return PersonBuilder().apply(block).build()
}
