	.text
	.file	"program.ll"
	.globl	main                            # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
# %bb.0:
	pushq	%rax
	movl	$3, 4(%rsp)
	movq	printf_str_int@GOTPCREL(%rip), %rdi
	movl	$3, %esi
	xorl	%eax, %eax
	callq	printf@PLT
	xorl	%eax, %eax
	popq	%rcx
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
                                        # -- End function
	.type	scanf_str_int,@object           # @scanf_str_int
	.section	.rodata,"a",@progbits
	.globl	scanf_str_int
scanf_str_int:
	.asciz	"%d"
	.size	scanf_str_int, 3

	.type	scanf_str_float32,@object       # @scanf_str_float32
	.globl	scanf_str_float32
scanf_str_float32:
	.asciz	"%f"
	.size	scanf_str_float32, 3

	.type	scanf_str_float64,@object       # @scanf_str_float64
	.globl	scanf_str_float64
scanf_str_float64:
	.asciz	"%lf"
	.size	scanf_str_float64, 4

	.type	printf_str_int,@object          # @printf_str_int
	.globl	printf_str_int
printf_str_int:
	.asciz	"%d\n"
	.size	printf_str_int, 4

	.type	printf_str_float32,@object      # @printf_str_float32
	.globl	printf_str_float32
printf_str_float32:
	.asciz	"%f\n"
	.size	printf_str_float32, 4

	.type	printf_str_float64,@object      # @printf_str_float64
	.globl	printf_str_float64
printf_str_float64:
	.asciz	"%lf\n"
	.size	printf_str_float64, 5

	.type	strpi,@object                   # @strpi
	.globl	strpi
strpi:
	.asciz	"%d\n"
	.size	strpi, 4

	.type	strpd,@object                   # @strpd
	.globl	strpd
strpd:
	.asciz	"%f\n"
	.size	strpd, 4

	.type	strs,@object                    # @strs
	.globl	strs
strs:
	.asciz	"%d"
	.size	strs, 3

	.section	".note.GNU-stack","",@progbits
