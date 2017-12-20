package remote.messages;

import com.google.common.collect.ImmutableSet;

import java.io.Serializable;
import java.util.Objects;

public class PasswordListMessage implements Serializable {

    private final ImmutableSet<String> passwordHashes;

    public PasswordListMessage(ImmutableSet<String> passwordHashes) {
        this.passwordHashes = passwordHashes;
    }

    public ImmutableSet<String> getPasswordHashes() {
        return passwordHashes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordListMessage that = (PasswordListMessage) o;
        return Objects.equals(passwordHashes, that.passwordHashes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordHashes);
    }
}
