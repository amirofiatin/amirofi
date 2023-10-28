import java.awt.List
import java.util.concurrent.Flow
import kotlin.collections.List as List1

interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

    fun getAlphabetizedWords(): Flow<List<Word>>
}